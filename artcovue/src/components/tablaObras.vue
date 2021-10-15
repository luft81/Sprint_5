<template>

    <div class="clas">
        <fieldset>
            <legend>Tabla de Obras</legend>

<table>

  <tr>
    <th>id</th>
    <th>titulo</th>
    <th>autor</th>
    <th>tipo</th>
    <th>tecnica</th>
    <th>año</th>
    <th>dimensiones</th>
    <th>estado</th>
    <th>ubicacion</th>
    <th>avaluo</th>
    <th>idArtista</th>
  </tr>

  <tr v-for="obra in obras" :key="obra.idObra">

    <td>{{obra.idObra}}</td>
    <td>{{obra.titulo}}</td>
    <td>{{obra.autor}}</td>
    <td>{{obra.tipo}}</td>
    <td>{{obra.tecnica}}</td>
    <td>{{obra.año}}</td>
    <td>{{obra.dimensiones}}</td>
    <td>{{obra.estado}}</td>
    <td>{{obra.ubicacion}}</td>
    <td>{{obra.avaluo}}</td>
    <td>{{obra.idArtista}}</td>

  </tr>

</table>

        </fieldset>
        <router-view/>

    </div>



</template>

<script>

import axios from 'axios'

export default{

name:'tablaObras',

data(){

  return{

     obras:[]

  }

},

mounted(){

  let vue=this;

  axios.get('http://localhost:8080/api/obras/listar')

  .then( response =>{

    vue.obras=response.data;

  })

},methods:{

}
}

</script>

<style scoped>

.tablaObras{

padding: 5%;
text-align: center;

}

table{

    border: 1px solid #000;
    margin: auto;
    padding: 1 px;

}

th{

border: 1px solid #000;

}

tr,td{

   width: 20%;
   text-align: left;
   vertical-align:top;
   border: 1px solid #000;

}

</style>
