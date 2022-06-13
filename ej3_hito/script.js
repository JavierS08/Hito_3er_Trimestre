let docXMLTexto = 
	"<Contactos> <Contacto> <Nombre>MIGUEL ANGEL ROBLES</Nombre> <Tlf>61 666 66 22</Tlf> </Contacto> <Contacto> <Nombre>CARLOS DURAN ROJAS</Nombre> <Tlf>61 392 39 39</Tlf> </Contacto> <Contacto> <Nombre>ROSA CARBONERO DE MIGUEL</Nombre> <Tlf>666 55 99 22</Tlf> </Contacto> <Contacto> <Nombre>ISMAEL DELGADO ESPINOSA</Nombre> <Tlf>929 49 29 29</Tlf> </Contacto> <Contacto> <Nombre>JOSE LUIS DE LA TORRE</Nombre> <Tlf>92 492 29292</Tlf> </Contacto> <Contacto> <Nombre>FEDERICO RUBIO</Nombre> <Tlf>61 699 99 99</Tlf> </Contacto> </Contactos>";

let parser = new DOMParser();
let documentXML = parser.parseFromString(docXMLTexto,"text/xml");

function carga() {
	var table="<tr><th>NOMBRE</th><th>TELEFONO</th></tr>";
	var contactos = documentXML.getElementsByTagName("Contacto");
	for (i = 0; i<contactos.length; i++) { 
	    table += "<tr><td>" +
	    contactos[i].getElementsByTagName("Nombre")[0].childNodes[0].nodeValue +
			"</td><td>" +
	    contactos[i].getElementsByTagName("Tlf")[0].childNodes[0].nodeValue +
			"</td></tr>";
	}
	document.getElementById("demo").innerHTML = table;
}
