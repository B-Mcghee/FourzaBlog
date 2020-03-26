<template>
    <div class="container-fluid">
        <div class="header-box">
       <app-header></app-header>
    </div>
    <div class="content">
        <app-blog></app-blog>
    </div>
    </div>
</template>

<script>
import Header from './header/Header'
import Blog from './layout/blogs/Blog'

export default {
  components: {
    appHeader: Header,
    appBlog: Blog
  }
}
</script>

<style>
*{
    box-sizing: border-box;
}
</style>