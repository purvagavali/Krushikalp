<?php
include 'datasource.php';

if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    $name = $_POST['name'] ?? '';
      $framer_id = $_POST['fid'] ?? '';
       $uid= $_POST['uid'] ?? '';
	 $email = $_POST['mail'] ?? '';
	  $contact = $_POST['contact'] ?? '';
	   $address = $_POST['add'] ?? '';
           $pname=$_POST['pname']?? '';
            $quantity=$_POST['quantity']?? '';
//	    $framer_id=$_POST['framer_id']?? '';
	   
//	   echo $name."//".$address;

$sql = "INSERT INTO `order_details`(`id`, `name`, `email`, `contact`, `address`, `pname`, `quantity`,`farmer_id`,`uid`) VALUES (null,'$name',' $email',' $contact','$address','$pname','$quantity','$framer_id','$uid')"; // Your SQL query
//$result = $conn->query($sql);

 if(mysqli_query($conn, $sql)){
            echo "<h3>Data stored in a database successfully." 
                . " Thank you for placing order</h3>"; 
                 header("Location:Payment.php");
        } else{
            echo "ERROR: Hush! Sorry $sql. " 
                . mysqli_error($conn);
        }
        
        // Close connection
        mysqli_close($conn);

}

?>
               

