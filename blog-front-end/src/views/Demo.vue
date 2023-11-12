<!--
 * @LastEditors: Ding Cong   E-mail: dingcong3@163.com
 * @LastEditTime: 2023-11-12 11:32:30
 * @FilePath: \blog-front-end\src\views\demo.vue
 * @something wanna say: 
-->
<template>
    <div class="Demo">
        {{msg}}
         <el-button type="primary">主要按钮</el-button>
    </div>
</template>
<script>
    export default{
        name: "Demo",
        data() {
            return {
                msg: "测试"
            };
        }
    }
</script>
