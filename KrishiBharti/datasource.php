
<?php

$servername="localhost";
$username="root";
$password="";
$dbname="aipower_agri";

 $conn = new mysqli($servername, $username, $password, $dbname );
if(!$conn)
{
    trigger_error('Could not connect to mysql:' .mysqli_connect_error());
}
 else
     {
   
     return  $conn;
     echo 'connect';
 }

        


?>

