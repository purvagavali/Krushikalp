<html>
<head>
    <script src="https://cdn.tailwindcss.com"></script>
</head>
<body class="bg-gray-200 flex items-center justify-center min-h-screen">
    <div class="bg-white p-6 rounded-lg shadow-lg w-full max-w-sm">
        <h2 class="text-gray-700 text-lg font-semibold mb-4">Credit card detail</h2>
        
        <form action="PaymentDetails.php" method="POST">
            <div class="mb-4">
                <input type="text" placeholder="Card Number" class="w-full p-3 border border-gray-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-500" id="c_no"  name="c_no" >
            </div>
            <div class="flex space-x-4 mb-4">
                <select class="w-1/2 p-3 border border-gray-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-500" id="month" value="<?php echo $_GET['month'];?>" name="month">
                    <option>January</option>
                    <option>February</option>
                    <option>March</option>
                    <option>April</option>
                    <option>May</option>
                    <option>June</option>
                    <option>July</option>
                    <option>August</option>
                    <option>September</option>
                    <option>October</option>
                    <option>November</option>
                    <option>December</option>
                </select>
                <select class="w-1/2 p-3 border border-gray-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-500" id="year" value="<?php echo $_GET['year'];?>" name="year">
                    <option>2016</option>
                    <option>2017</option>
                    <option>2018</option>
                    <option>2019</option>
                    <option>2020</option>
                    <option>2021</option>
                    <option>2022</option>
                    <option>2023</option>
                    <option>2024</option>
                    <option>2025</option>
                </select>
            </div>
            <div class="mb-4">
                <input type="text" placeholder="CVV" class="w-full p-3 border border-gray-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-500" id="cvv_no"  name="cvv_no">
                <p class="text-gray-400 text-sm mt-1">3 or 4 digits usually found on the signature strip</p>
            </div>
            <button type="submit" class="w-full bg-green-500 text-white p-3 rounded-lg font-semibold hover:bg-green-600 focus:outline-none focus:ring-2 focus:ring-green-500">Proceed</button>
        </form>
    </div>
</body>
</html>