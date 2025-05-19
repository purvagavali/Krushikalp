<?php
  $coords[0] = $_GET['lattitude'];
        $coords[1] = $_GET['longitude'];
  $url = 'http://api.openweathermap.org/data/2.5/weather?lat=' . $coords[0] . '&lon=' . $coords[1].'&units=metric&cnt=7&lang=en&APPID=2f8796eefe67558dc205b09dd336d022';
        $data = json_decode(file_get_contents($url));
$weather_info = array();
//        array_push($weather_info, $data['objects'][0]['weather']['status'] . '-' . $data['objects'][0]['weather']['measured']['temperature']);
        array_push($weather_info, $data->weather[0]->main . '-' . round($data->main->temp,0));
        echo join(",", $weather_info);
