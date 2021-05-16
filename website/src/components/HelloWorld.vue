<template>
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
                  <a href="index.html" class="tm-nav-link active">Home</a>
                </li>
                <li class="tm-nav-li">
                  <a href="about.html" class="tm-nav-link">About</a>
                </li>
                <li class="tm-nav-li">
                  <a href="contact.html" class="tm-nav-link">Contact</a>
                </li>
              </ul>
            </nav>
          </div>
        </div>
      </div>
    </div>

    <main>
      <header class="row tm-welcome-section">
        <h2 class="col-12 text-center tm-section-title">
          Welcome Barbershop
        </h2>
        <p class="col-12 text-center">
          Barbershop is one of the oldest and most respected London Barber Shop,
          grown into an international barber shop with shops across London and
          New York City. Pall Mall Barbers Trafalgar Square a name synonymous
          with men’s barber shops, providing the best mix of traditional barber
          services for the modern man. Pall Mall Barbers London is one of the
          oldest and most respected barber brands in the world. We have set the
          benchmark for the style-conscious gentleman, giving the perfect
          grooming treatment to any gent who walks through our doors.
        </p>
      </header>

      <h2 class="col-12 text-center tm-section-title">
        Haircuts gallery
      </h2>
      <!-- Gallery -->
      <div class="row tm-gallery">
        <!-- gallery page 1 -->
        <div class="tm-gallery-page">
          <article
            class="col-lg-3 col-md-4 col-sm-6 col-12 tm-gallery-item"
            v-for="h in haircuts"
            :key="h.id"
          >
            <figure>
              <img
                :src="h.pictureURL"
                alt="Image"
                class="img-fluid tm-gallery-img"
              />
              <figcaption>
                <h4 class="tm-gallery-title">{{ h.name }}</h4>
                <p class="tm-gallery-description">
                  {{ h.note }}
                </p>
                <p class="tm-gallery-price">${{ h.price }}</p>
              </figcaption>
            </figure>
          </article>
        </div>
        <!-- gallery page 3 -->
      </div>

      <div>
        <router-link to="/appointment" class="tm-paging-link active"
          >Book an appointment</router-link
        >
      </div>
    </main>

    <footer class="tm-footer text-center">
      <p>
        Copyright &copy; 2020 Simple House | Design:
        <a rel="nofollow" href="https://templatemo.com">TemplateMo</a>
      </p>
    </footer>
  </div>
</template>

<script>
import axios from "axios";

export default {
  name: "HelloWorld",
  data() {
    return {
      haircuts: [],
      gender: "all",
    };
  },
  methods: {
    getHaircuts() {
      axios
        .get("http://localhost:8080/haircut")
        .then((response) => {
          this.haircuts = response.data;
          console.log(this.haircuts);
        })
        .catch((error) => {
          console.log(error);
        });
    },
  },
  created() {
    this.getHaircuts();
  },
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped></style>
