<?php
include 'datasource.php';
// $sql=mysqli_query($conn);
if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    $name = $_POST['uname'] ?? '';
	 $password = $_POST['upass'] ?? '';
	  $mobile = $_POST['umobile'] ?? '';
	   $address = $_POST['uadd'] ?? '';
	   
	   
	   echo $name."//".$address;

   
			$user="admin@gmail.com";
            // echo "INSERT INTO notice (user, `subject`, `Description`) VALUES (?, ?, ?,?)";
$sql="INSERT INTO `user_reg`(`id`, `name`, `password`, `mobile`, `address`) VALUES(null,'$name',' $password',' $mobile','$address')";

            $conn->query($sql);
			//    $stmt = $conn->prepare("INSERT INTO notice (user, `subject`, `Description`, `file_path`) VALUES (?, ?, ?,?)");
            // $stmt->bind_param("ssss", $user,$text, $fileName, $imagePath);
            // $stmt->execute();
                    } else {
            echo json_encode(['status' => 'error', 'message' => 'Database saved']);
        }
    


?>
