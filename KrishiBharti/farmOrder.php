<!DOCTYPE html>
<html lang="en">
   <head>
      <!-- basic -->
      <style>
          body {
  font-family: 'lato', sans-serif;
}
.container {
  max-width: 1000px;
  margin-left: auto;
  margin-right: auto;
  padding-left: 10px;
  padding-right: 10px;
}

h2 {
  font-size: 26px;
  margin: 20px 0;
  text-align: center;
  small {
    font-size: 0.5em;
  }
}

.responsive-table {
  li {
    border-radius: 3px;
    padding: 25px 30px;
    display: flex;
    justify-content: space-between;
    margin-bottom: 25px;
  }
  .table-header {
    background-color: #95A5A6;
    font-size: 14px;
    text-transform: uppercase;
    letter-spacing: 0.03em;
  }
  .table-row {
    background-color: #ffffff;
    box-shadow: 0px 0px 9px 0px rgba(0,0,0,0.1);
  }
  .col-1 {
    flex-basis: 10%;
  }
  .col-2 {
    flex-basis: 20%;
  }
  .col-3 {
    flex-basis: 25%;
  }
  .col-4 {
    flex-basis: 25%;
  }
  .col-5 {
    flex-basis: 30%;
  }
  .col-6{
    flex-basis: 25%;
  }
  .col-7 {
    flex-basis: 25%;
  }
  
  @media all and (max-width: 767px) {
    .table-header {
      display: none;
    }
    .table-row{
      
    }
    li {
      display: block;
    }
    .col {
      
      flex-basis: 100%;
      
    }
    .col {
      display: flex;
      padding: 10px 0;
      &:before {
        color: #6C7A89;
        padding-right: 10px;
        content: attr(data-label);
        flex-basis: 50%;
        text-align: right;
      }
    }
  }
}

  


      </style>
   </head>
   <body>
     <div class="container">
  <h2>Order Details</h2>
  <ul class="responsive-table">
    <li class="table-header">
      <div class="col col-1">Id</div>
      <div class="col col-2">Customer Name</div>
      <div class="col col-3">Email</div>
      <div class="col col-4">Contact</div>
      <div class="col col-5">Address</div>
      <div class="col col-6">Product</div>
      <div class="col col-7">Quantity</div>
    </li>
            <?php
include 'datasource.php';
$fid=$_GET['fid'];
$sql = "SELECT * FROM `order_details`  where farmer_id='$fid'"; // Your SQL query
$result = $conn->query($sql);
if(mysqli_query($conn, $sql)){
            echo "<h3> placedorders."."</h3>"; 
        } else{
            echo "ERROR: Hush! Sorry $sql. " 
                . mysqli_error($conn);
        }
//  $uid=$_GET[''];
    while ($row = $result->fetch_assoc()) {

?>
    <li class="table-row">
      <div class="col col-1" data-label="FarmerId"><?php echo $row['farmer_id'];?></div>
      <div class="col col-2" data-label="Customer Name"><?php echo $row['name'];?></div>
      <div class="col col-3" data-label="Email"><?php echo $row['email'];?></div>&nbsp;
      <div class="col col-4" data-label="Contact"><?php echo $row['contact'];?></div>
       <div class="col col-5" data-label="Address"><?php echo $row['address'];?></div>
       <div class="col col-6" data-label="Product"><?php echo $row['pname'];?></div>
       <div class="col col-7" data-label="Quantity"><?php echo $row['quantity'];?></div>
    </li>
    <?php } ?>
  </ul>
</div>
   </body>
</html>