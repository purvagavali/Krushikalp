<?php
include 'datasource.php';
// $sql=mysqli_query($conn);
//if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    $name = $_GET['username'] ?? '';
	 $password = $_GET['password'] ?? '';
	 // $mobile = $_POST['umobile'] ?? '';
	  // $address = $_POST['uadd'] ?? '';
	   
	   
//	   echo $name."//".$address;

   
			$user="admin@gmail.com";
            // echo "INSERT INTO notice (user, `subject`, `Description`) VALUES (?, ?, ?,?)";
//$sql="INSERT INTO `user_reg`(`id`, `name`, `password`, `mobile`, `address`) VALUES(null,'$name',' $password',' $mobile','$address')";
$sql="SELECT * FROM `user_reg` WHERE name='$name' AND password='$password'";
//echo $sql;
           $result= $conn->query($sql);
            if ($row = $result->fetch_assoc()) {
//    ; 
    
    echo $row['id'];
    // Verify password using password_verify function (recommended for security)
//    if (password_verify($password, $row['password'])) {
//        // User is authenticated, proceed to login logic
//        echo "Login successful!";
//    } else {
//        echo "Incorrect password";
//    }
} else {
    echo "Invalid username"; 
}
			
                  
    
?>
