<!--
 * @LastEditors: Ding Cong   E-mail: dingcong3@163.com
 * @LastEditTime: 2023-11-12 11:53:19
 * @FilePath: \blog-front-end\src\App.vue
-->
<template>
  <div id="app">
    <div id="nav">
      <router-link to="/">home</router-link>
      <router-link to="/about">about</router-link>
      <router-link to="/demo">demo</router-link>
      <router-link to="/login">login</router-link>
    </div>  
    <!-- <img src="./assets/logo.png"> -->
    <router-view/>
  </div>
</template>
<script>
export default {
  name: 'App'
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
