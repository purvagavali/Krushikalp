<?php
include 'datasource.php';
// $sql=mysqli_query($conn);
if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    $pname=$_POST['pname'] ?? '';
	 $price = $_POST['price'] ?? '';
	  $description = $_POST['decs'] ?? '';
	   $pescides = $_POST['pesd'] ?? '';
	      $fid = $_POST['fid'] ?? '';
	   
	   echo $pname."//".$pescides;

    if (isset($_FILES['image'])) {
        $imagePath = 'uploads/' . basename($_FILES['image']['name']);
		      $fileName = basename($_FILES['image']['name']);
        $imagePath = $uploadsDir . $fileName;
        if (move_uploaded_file($_FILES['image']['tmp_name'], $imagePath)) {
            echo json_encode([
                'status' => 'success',
                'text' => $pname,
                'imagePath' => $imagePath,
            ]);
			$user="admin@gmail.com";
            // echo "INSERT INTO notice (user, `subject`, `Description`) VALUES (?, ?, ?,?)";
$sql="INSERT INTO `onlinemarket`(`id`, `name`, `price`, `description`, `persticide`, `image`, `farmer_id`) VALUES (null,'$pname',' $price',' $description','$pescides',' $imagePath', '$fid')";

            $conn->query($sql);
			//    $stmt = $conn->prepare("INSERT INTO notice (user, `subject`, `Description`, `file_path`) VALUES (?, ?, ?,?)");
            // $stmt->bind_param("ssss", $user,$text, $fileName, $imagePath);
            // $stmt->execute();
                    } else {
            echo json_encode(['status' => 'error', 'message' => 'Failed to upload image']);
        }
    } else {
        echo json_encode(['status' => 'error', 'message' => 'No image provided']);
    }
} else {
    echo json_encode(['status' => 'error', 'message' => 'Invalid request method']);
}
?>
