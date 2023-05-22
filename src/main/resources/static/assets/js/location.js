const longitudeInput = document.getElementById("longitudeInput");
const latitudeInput = document.getElementById("latitudeInput");
function getLocation() {
    if (navigator.geolocation){
         navigator.geolocation.getCurrentPosition((pos) => {
             longitudeInput.value = pos.coords.longitude;
             latitudeInput.value = pos.coords.latitude;
         });

    }
    else {
        alert("Sorry. Find my location is not supported on your browser.")
    }
}

