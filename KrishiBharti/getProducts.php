<?php
include 'datasource.php';

$sql = "SELECT * FROM `onlinemarket` "; // Your SQL query
$result = $conn->query($sql); // Execute the query

//if ($result) { // Check if the query was successful
//    if ($result->num_rows > 0) { // Check if there are any rows
//        while ($row = $result->fetch_assoc()) {
//            // Process each row
//            echo $row['name'] . "<br>";
//        }
//    } else {
//        echo "No products found.";
//    }
//} else {
//    echo "Error in query: " . $conn->error; // Crucial: Check for query errors!
//}


    
//if ($result) {
//      if ($result->num_rows > 0) {
//        while ($row = $result->fetch_assoc()) {
//          echo "<div class='product'>";
//          echo "<h2>" . $row['name'] . "</h2>";
//
//          // Display the image if available
//          if (!empty($row['image_path'])) { // Assuming you have an 'image_path' column
//            echo "<img src='" . $row['image_path'] . "' alt='" . $row['name'] . "'>";
//          } else {
//            echo "<p>No image available</p>"; // Or a placeholder image
//          }
//
//
//          echo "<p><strong>Price:</strong> " . $row['price'] . "</p>";
//          echo "<p><strong>Description:</strong> " . $row['description'] . "</p>";
//          echo "<p><strong>Pesticides:</strong> " . $row['persticide'] . "</p>"; // Assuming you have a 'pesticides' column
//          echo "<p><strong>Uploaded:</strong> " . $row['image'] . "</p>"; // Assuming you have an 'uploaded_at' column
//          echo "</div>";
//        }
//      } else {
//        echo "<p>No products found.</p>";
//      }
//    } else {
//      echo "Error in query: " . $conn->error;
//    }
//
//    $conn->close();








if ($result) {
    if ($result->num_rows > 0) {
        // Start the HTML table
        echo "<table border='1'>"; // You can add CSS classes for styling instead of inline styles
        echo "<tr>
                <th>Name</th>
                <th>Image</th>
                <th>Price</th>
                <th>Description</th>
                <th>Pesticides</th>
                <th>Uploaded</th>
              </tr>"; // Table headers

        while ($row = $result->fetch_assoc()) {
            echo "<tr>";
            echo "<td>" . htmlspecialchars($row['name']) . "</td>"; // Use htmlspecialchars to prevent XSS
            echo "<td>";
            if (!empty($row['image_path'])) {
                echo "<img src='" . htmlspecialchars($row['image_path']) . "' alt='" . htmlspecialchars($row['name']) . "' style='width:100px;height:auto;'>"; // Limit image size
            } else {
                echo "No image available"; // Or a placeholder image
            }
            echo "</td>";
            echo "<td>" . htmlspecialchars($row['price']) . "</td>";
            echo "<td>" . htmlspecialchars($row['description']) . "</td>";
            echo "<td>" . htmlspecialchars($row['persticide']) . "</td>"; // Assuming you have a 'pesticides' column
            echo "<td>" . htmlspecialchars($row['image']) . "</td>"; // Assuming you have an 'uploaded_at' column
            echo "</tr>";
        }
        echo "</table>"; // End the table
    } else {
        echo "<p>No products found.</p>";
    }
} else {
    echo "Error in query: " . $conn->error;
}

$conn->close();
?>



