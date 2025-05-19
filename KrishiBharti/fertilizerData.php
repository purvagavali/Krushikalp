

<?php
// Database connection
include 'datasource.php';

// Get the selected values from the form
$temperature = $_POST['temp'];
$soil_type = $_POST['soil'];
$crop_type = $_POST['crop'];

// Prepare and execute the SQL query to get fertilizer
$sql = "SELECT `Fertilizer Name` FROM `fertilizer` WHERE `Temperature` = '$temperature' AND `Soil Type` = '$soil_type' AND `Crop Type` = '$crop_type'";

//echo $sql;
$result = $conn->query($sql);
//$stmt->bind_param("iss", $temperature, $soil_type, $crop_type);
//$stmt->execute();
//$result = $stmt->get_result();

// Display the results
if ($row=$result->fetch_assoc()) {
   echo "<div style='display: flex; justify-content: center; align-items: center; min-height: 100vh; flex-direction: column;'>"; // Flexbox for centering
    echo "<div style='text-align: center; font-weight: bold;'>"; // Centered and bold container for text
    echo "<h2>Recommended Fertilizer:</h2>";
    echo "Fertilizer: " . $row["Fertilizer Name"] . "<br>";
    echo "</div>"; // Close the inner container
    echo "</div>"; // Close the outer container
} else {
    echo "<div style='display: flex; justify-content: center; align-items: center; min-height: 100vh; flex-direction: column;'>"; // Flexbox for centering
    echo "<div style='text-align: center; font-weight: bold;'>";
    echo "No fertilizer recommendations found for the selected parameters.";
    echo "</div>";
    echo "</div>";
}


// Close the connection
//$stmt->close();
//$conn->close();
?>

