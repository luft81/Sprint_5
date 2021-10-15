<template>

    <div class="obras">

<formularioObras/> 

<tablaObras/>

    </div>

</template>

<script>

import formularioObras from '@/components/formularioObras.vue'

import tablaObras from '@/components/tablaObras.vue'

export default {

  name: 'Obras',

  components: {

    formularioObras,tablaObras

  }
}


</script>

<style scoped>

.obras{

    text-align: center;

}

</style>