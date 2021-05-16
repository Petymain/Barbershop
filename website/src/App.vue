<template>
  <div id="app">
    <!-- <div id="nav">
      <router-link to="/">Home</router-link> |
      <router-link to="/about">About</router-link>
    </div> -->
    <div class="container">
      <!-- Top box -->
      <!-- Logo & Site Name -->
      <div class="placeholder">
        <div
          class="parallax-window"
          data-parallax="scroll"
          data-image-src="img/nathon-oski-EW_rqoSdDes-unsplash.jpg"
        >
          <div class="tm-header">
            <div class="row tm-header-inner">
              <div class="col-md-6 col-12">
                <img
                  src="img/simple-house-logo.png"
                  alt="Logo"
                  class="tm-site-logo"
                />
                <div class="tm-site-text-box">
                  <h1 class="tm-site-title">Barbershop</h1>
                  <h6 class="tm-site-description">
                    Hairdressing at its finest
                  </h6>
                </div>
              </div>
              <nav class="col-md-6 col-12 tm-nav">
                <ul class="tm-nav-ul">
                  <li class="tm-nav-li">
                    <router-link
                      to="/"
                      class="tm-nav-link"
                      :class="{ active: $route.path == '/' }"
                      >Home</router-link
                    >
                  </li>
                  <li class="tm-nav-li">
                    <router-link
                      to="/appointment"
                      :class="{ active: $route.path == '/appointment' }"
                      class="tm-nav-link"
                      >Appointment</router-link
                    >
                  </li>
                </ul>
              </nav>
            </div>
          </div>
        </div>
      </div>

      <main>
        <router-view />
      </main>

      <footer class="tm-footer text-center">
        <p>
          Copyright &copy; 2020 Simple House | Design:
          <a rel="nofollow" href="https://templatemo.com">TemplateMo</a>
        </p>
      </footer>
    </div>
  </div>
</template>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

#nav {
  padding: 30px;
}

#nav a {
  font-weight: bold;
  color: #2c3e50;
}

#nav a.router-link-exact-active {
  color: #42b983;
}
</style>
