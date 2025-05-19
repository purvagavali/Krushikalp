<?php
include 'datasource.php';

if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    $c_no = $_POST['c_no'] ?? '';
       $uid= $_POST['uid'] ?? '';
	 $month = $_POST['month'] ?? '';
	  $year = $_POST['year'] ?? '';
	   $cvv_no = $_POST['cvv_no'] ?? '';
         

$sql = "INSERT INTO `pay_details`(`id`, `c_no`, `month`, `year`, `cvv_no`, `uid`) VALUES(null,'$c_no',' $month',' $year','$cvv_no','$uid')"; // Your SQL query
//$result = $conn->query($sql);

 if(mysqli_query($conn, $sql)){
            echo "<h3>Data stored." 
                . " Thank you</h3>"; 
        } else{
            echo "ERROR: Hush! Sorry $sql. " 
                . mysqli_error($conn);
        }
        
        // Close connection
        mysqli_close($conn);

}

?>
