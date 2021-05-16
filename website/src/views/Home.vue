<template>
  <div>
    <header class="row tm-welcome-section">
      <h2 class="col-12 text-center tm-section-title">
        Welcome Barbershop
      </h2>
      <p class="col-12 text-center">
        Barbershop is one of the oldest and most respected London Barber Shop,
        grown into an international barber shop with shops across London and New
        York City. Pall Mall Barbers Trafalgar Square a name synonymous with
        men’s barber shops, providing the best mix of traditional barber
        services for the modern man. Pall Mall Barbers London is one of the
        oldest and most respected barber brands in the world. We have set the
        benchmark for the style-conscious gentleman, giving the perfect grooming
        treatment to any gent who walks through our doors.
      </p>
    </header>
    <div style="margin: 35px auto">
      <router-link
        type="submit"
        class="tm-btn tm-btn-success tm-btn-right"
        to="/appointment"
      >
        Book an appointment
      </router-link>
    </div>
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
      <router-link
        type="submit"
        class="tm-btn tm-btn-success tm-btn-right"
        to="/appointment"
      >
        Book an appointment
      </router-link>
    </div>
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
