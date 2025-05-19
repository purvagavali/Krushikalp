<html>
<head>
    <title>Frequently Asked Questions</title>
    <script src="https://cdn.tailwindcss.com"></script>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
    <style>
        .hidden {
            display: none;
        }
    </style>
</head>
<body class="bg-gray-100 flex items-center justify-center min-h-screen">
    <div class="w-full max-w-2xl bg-white p-6 rounded-lg shadow-md">
        <h1 class="text-2xl font-semibold mb-4">Frequently Asked Questions</h1>
        <div class="space-y-4">
            <div class="border-b">
                <button class="w-full text-left py-4 flex justify-between items-center" onclick="toggleAnswer(1)">
                    <span class="font-semibold">1. What exactly is precision agriculture (or smart farming)? </span>
                    <i class="fas fa-chevron-down"></i>
                </button>
                <div id="answer-1" class="pl-4 pb-4 text-gray-600 hidden">
                    It's an approach to farm management that uses information technology (like GPS, sensors, drones, AI, IoT) to observe, measure, and respond to variations within fields.
                    The goal is to apply resources like water, fertilizer, and pesticides more accurately and efficiently, only where they are needed.
                </div>
            </div>
            <div class="border-b">
                <button class="w-full text-left py-4 flex justify-between items-center" onclick="toggleAnswer(2)">
                    <span class="font-semibold">2. What are smart irrigation techniques?</span>
                    <i class="fas fa-chevron-down"></i>
                </button>
                <div id="answer-2" class="pl-4 pb-4 text-gray-600 hidden">
                    These are methods that aim to apply water precisely when and where crops need it, minimizing waste.
                    Examples include drip irrigation (delivering water directly to the roots), precision sprinklers, and automated systems that use data from soil moisture sensors, weather forecasts, and plant water status sensors to schedule irrigation.
                </div>
            </div>
            <div class="border-b">
                <button class="w-full text-left py-4 flex justify-between items-center" onclick="toggleAnswer(3)">
                    <span class="font-semibold">3. Can you explain intercropping strategies that work well with coconut plantations in Konkan? </span>
                    <i class="fas fa-chevron-down"></i>
                </button>
                <div id="answer-3" class="pl-4 pb-4 text-gray-600 hidden">
                    Depending on the age and spacing of coconut palms (light availability):
Early years (more light): Banana, Pineapple, Ginger, Turmeric, Elephant Foot Yam, Vegetables.
Mature plantations: Black Pepper (trained on palms), Nutmeg, Cinnamon, Cocoa (if shade is sufficient), fodder grasses in open spaces.
                </div>
            </div>
            <div class="border-b">
                <button class="w-full text-left py-4 flex justify-between items-center" onclick="toggleAnswer(4)">
                    <span class="font-semibold">4. Explain how soil moisture sensors work and how they can help optimize irrigation.</span>
                    <i class="fas fa-chevron-down"></i>
                </button>
                <div id="answer-4" class="pl-4 pb-4 text-gray-600 hidden">
                   Soil moisture sensors are devices placed in the soil at the crop's root zone. 
                   They measure the amount of water present in the soil, typically as a percentage or volumetric water content.
                </div>
            </div>
            <div class="border-b">
                <button class="w-full text-left py-4 flex justify-between items-center" onclick="toggleAnswer(5)">
                    <span class="font-semibold">5. How might predicted weather patterns affect pest cycles or irrigation needs for my crops this week?</span>
                    <i class="fas fa-chevron-down"></i>
                </button>
                <div id="answer-5" class="pl-4 pb-4 text-gray-600 hidden">
                     If the forecast shows rising temperatures and humidity:
Pests: Activity of insects like hoppers or TMB might increase. High humidity can favour fungal growth.
Irrigation: Higher temperatures increase water evaporation and plant transpiration, thus increasing irrigation needs, especially if there are no pre-monsoon showers. Check soil moisture before irrigating.
                </div>
            </div>
            <div class="border-b">
                <button class="w-full text-left py-4 flex justify-between items-center" onclick="toggleAnswer(6)">
                    <span class="font-semibold">6. Can you suggest some high-yielding, salt-tolerant rice varieties suitable for coastal Maharashtra?</span>
                    <i class="fas fa-chevron-down"></i>
                </button>
                <div id="answer-6" class="pl-4 pb-4 text-gray-600 hidden">
                     Regional agricultural universities like Dr. BSKKV, Dapoli, release varieties suitable for Konkan conditions. Look for varieties like: Ratnagiri-24, Karjat series (e.g., Karjat-3, Karjat-7), Panvel-1,
                     Bhogawati, or newer releases specifically recommended for coastal saline areas. Consult local KVK (Krishi Vigyan Kendra) or agricultural office for the latest recommendations
                </div>
            </div>
            <div class="border-b">
                <button class="w-full text-left py-4 flex justify-between items-center" onclick="toggleAnswer(7)">
                    <span class="font-semibold">7.  When is the ideal time to apply fertilizers for cashew trees in the Konkan region?</span>
                    <i class="fas fa-chevron-down"></i>
                </button>
                <div id="answer-7" class="pl-4 pb-4 text-gray-600 hidden">
                    Fertilizer application is often split. A common recommendation is to apply just after the monsoon (September-October) when the soil has adequate moisture. Some also recommend a second, smaller dose pre-monsoon (May),
                    especially if irrigation is available. Dosage should be based on soil test results and tree age. Balanced NPK and necessary micronutrients are important.
                </div>
            </div>
            <div class="border-b">
                <button class="w-full text-left py-4 flex justify-between items-center" onclick="toggleAnswer(8)">
                    <span class="font-semibold">8.  What is agricultural biotechnology, and how is it used?</span>
                    <i class="fas fa-chevron-down"></i>
                </button>
                <div id="answer-8" class="pl-4 pb-4 text-gray-600 hidden">
                    It involves using tools from biology, genetics, and biochemistry to modify plants, animals, or microorganisms for agricultural purposes. Uses include developing crops with improved yields, pest/disease resistance (like Bt crops), herbicide tolerance, enhanced nutritional value (like Golden Rice), 
                    or tolerance to environmental stresses (like drought). Techniques include genetic engineering (GMOs) and newer methods like CRISPR gene editing.
                </div>
            </div>
            <div class="border-b">
                <button class="w-full text-left py-4 flex justify-between items-center" onclick="toggleAnswer(9)">
                    <span class="font-semibold">9. How sustainable are alternative protein sources compared to traditional livestock?</span>
                    <i class="fas fa-chevron-down"></i>
                </button>
                <div id="answer-9" class="pl-4 pb-4 text-gray-600 hidden">
Generally, plant-based proteins and insect farming have significantly lower environmental footprints (land use, water use, greenhouse gas emissions) than conventional livestock, particularly beef and lamb.
Cultivated meat also promises lower impacts, but its sustainability depends heavily on the energy sources used for production, which is still developing.
                </div>
            </div>
            <div class="border-b">
                <button class="w-full text-left py-4 flex justify-between items-center" onclick="toggleAnswer(10)">
                    <span class="font-semibold">10. What are smart irrigation techniques?</span>
                    <i class="fas fa-chevron-down"></i>
                </button>
                <div id="answer-10" class="pl-4 pb-4 text-gray-600 hidden">
                    These are methods that aim to apply water precisely when and where crops need it, minimizing waste. Examples include drip irrigation (delivering water directly to the roots),
                    precision sprinklers, and automated systems that use data from soil moisture sensors, weather forecasts, and plant water status sensors to schedule irrigation.
                </div>
            </div>
         
        </div>
    </div>

    <script>
        function toggleAnswer(id) {
            const answer = document.getElementById(`answer-${id}`);
            answer.classList.toggle('hidden');
        }
    </script>
</body>
</html>