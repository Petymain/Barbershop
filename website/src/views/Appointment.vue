<template>
  <div class="about">
    <h1 style="margin: 35px auto">Book your appointment</h1>
    <div style="margin: 25px auto; max-width: 600px">
      <form @submit.prevent="submit">
        <div class="form-group">
          <input
            type="text"
            name="name"
            class="form-control"
            placeholder="Name"
            v-model="appointment.clientName"
            required=""
          />
        </div>

        <div class="form-group">
          <input
            type="email"
            name="email"
            class="form-control"
            placeholder="Email"
            v-model="appointment.email"
            required=""
          />
        </div>
        <div class="form-group">
          <input
            type="tel"
            name="tel"
            class="form-control"
            placeholder="Tel"
            v-model="appointment.tel"
            required=""
          />
        </div>
        <div class="form-group">
          <input
            type="datetime-local"
            name="date"
            class="form-control"
            placeholder="Date and time"
            v-model="appointment.dateTime"
            required=""
          />
        </div>
        <div class="form-group">
          <textarea
            rows="5"
            name="message"
            class="form-control"
            placeholder="Message"
            v-model="appointment.message"
            required=""
          ></textarea>
        </div>

        <div class="form-group tm-d-flex">
          <button type="submit" class="tm-btn tm-btn-success tm-btn-right">
            Send
          </button>
        </div>
      </form>
    </div>
  </div>
</template>
<script>
import axios from "axios";

export default {
  name: "Appointment",
  data() {
    return {
      appointment: {},
    };
  },
  methods: {
    submit() {
      console.log(this.appointment);
      axios
        .post("http://localhost:8080/appointment", this.appointment)
        .then((response) => {
          console.log(response);
          this.appointment = {};
          alert("Your booking has been successfully created!");
        })
        .catch((error) => {
          alert(error);
        });
    },
  },
};
</script>
