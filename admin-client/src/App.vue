<template>
  <div id="app" class="container">
    <div style="margin-top: 20px">
      <nav class="navbar navbar-light">
        <div class="container-fluid">
          <span class="navbar-brand mb-0 h1">Barbershop admin</span>
          <ul class="nav nav-pills">
            <li class="nav-item">
              <router-link class="nav-link" aria-current="page" to="/"
                >Haircuts</router-link
              >
            </li>
            <li class="nav-item">
              <router-link class="nav-link" to="/appointments"
                >Appointments</router-link
              >
            </li>
          </ul>
        </div>
      </nav>
    </div>
    <router-view />
  </div>
</template>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
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
