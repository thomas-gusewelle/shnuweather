// Get both form elements
const longitudeInput = document.getElementById("longitudeInput");
const latitudeInput = document.getElementById("latitudeInput");

// Uses goelocation api to prompt user for access to their location
// success callback sets the values in the form to the values provided from the API
// See: https://developer.mozilla.org/en-US/docs/Web/API/Geolocation_API
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

