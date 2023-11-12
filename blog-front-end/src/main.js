/*
 * @LastEditors: Ding Cong   E-mail: dingcong3@163.com
 * @LastEditTime: 2023-11-12 12:07:10
 * @FilePath: \blog-front-end\src\main.js
 */
// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'

import Element from 'element-ui'
import 'element-ui/lib/theme-chalk/index.css'
// 存储
import store from './store'
//在new Vue({}) 里面加入store
import './axios.js' // 请求拦截
Vue.use(Element)

Vue.config.productionTip = false

import axios from 'axios'
//引用全局
Vue.prototype.$axios = axios 

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  store,
  components: { App },
  template: '<App/>'
})