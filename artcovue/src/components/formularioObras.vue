<template>

    <div class="formObras">

<fieldset>

    <legend>Formulario Registro Obras</legend>

        <form action="">

            <label for="idObras">id de obras</label><br>
            <input type="text" name="idObras" id="idObras" v-model="obra.idObras"><br>

            <label for="nombre">titulo</label><br>
            <input type="text" name="titulo" id="titulo" v-model="obra.titulo"><br>

            <label for="autor">autor</label><br>
            <input type="text" name="autor" id="autor" v-model="obra.autor"><br>

            <label for="tipo">tipo</label><br>
            <input type="text" name="tipo" id="tipo" v-model="obra.tipo"><br>

            <label for="tecnica">tecnica</label><br>
            <input type="text" name="tecnica" id="tecnica" v-model="obra.tecnica" ><br><br>

            <label for="año">año</label><br>
            <input type="text" name="año" id="año" v-model="obra.año"><br>

            <label for="dimensiones">dimensiones</label><br>
            <input type="text" name="dimensiones" id="dimensiones" v-model="obra.dimensiones"><br>

            <label for="estado">estado</label><br>
            <input type="text" name="estado" id="estado" v-model="obra.estado"><br>

            <label for="ubicacion">ubicacion</label><br>
            <input type="text" name="ubicacion" id="ubicacion" v-model="obra.ubicacion"><br>

            <label for="avaluo">avaluo</label><br>
            <input type="text" name="avaluo" id="avaluo" v-model="obra.avaluo" ><br><br>

            <label for="idArtista">idArtista</label><br>
            <input type="text" name="idArtista" id="idArtista" v-model="obra.idArtista" ><br><br>

            <button type="submit" v-on:click="guardar()">Guardar</button>
            <button type="submit" v-on:click="eliminar(obra.idObra)">Eliminar</button>

        </form>

</fieldset>

    </div>

</template>

<script>

import axios from 'axios'

export default {

  name:'formularioObras',

data:function (){

return{

obra: {

idObra:"",
titulo:"",
autor: "",
tipo:"",
tecnica:"",
año:"",
dimensiones:"",
estado:"",
ubicacion:"",
avaluo:"",
idArtista:""

}

}

},

methods:{

guardar(){

axios.post('http://localhost:8080/api/obras',this.obra)

.then(data=>{
console.log(data);

})

},eliminar(id){

    axios.delete('http://localhost:8080/api/obras/'+id)
    .then(data=>{

console.log(data);

})

//location.reload()  

}
}
}

</script>

<style scoped>

.formObra{

text-align: center;
padding: 5%;
font-family : inherit;

}

</style>