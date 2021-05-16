<template>
  <div class="container">
    <section style="margin: 25px 0px;">
      <div class="row g-3">
        <div class="col-md-6" v-for="a in appointments" :key="a.id">
          <div class="card">
            <div class="card-body">
              <h6 class="card-title">Name: {{ a.clientName }}</h6>
              <h6 class="card-title">Tel: {{ a.tel }}</h6>
              <h6 class="card-title">Email: {{ a.email }}</h6>
              <h6 class="card-title">Date and time: {{ a.dateTime }}</h6>
              <h6 class="card-title">Message: {{ a.message }}</h6>
              <button
                class="btn btn-danger"
                data-bs-toggle="modal"
                data-bs-target="#exampleModal"
                @click="idToDelete = a.id"
              >
                Delete
              </button>
            </div>
          </div>
        </div>
      </div>
    </section>

    <!-- Modal -->
    <div
      class="modal fade"
      id="exampleModal"
      tabindex="-1"
      aria-labelledby="exampleModalLabel"
      aria-hidden="true"
    >
      <div class="modal-dialog">
        <div class="modal-content">
          <div class="modal-header">
            <h5 class="modal-title" id="exampleModalLabel">
              Delete appointment
            </h5>
            <button
              type="button"
              class="btn-close"
              data-bs-dismiss="modal"
              aria-label="Close"
            ></button>
          </div>
          <div class="modal-body">
            You are about to delete appointment: {{ idToDelete }}
          </div>
          <div class="modal-footer">
            <button
              type="button"
              class="btn btn-secondary"
              data-bs-dismiss="modal"
            >
              Close
            </button>
            <button
              type="button"
              class="btn btn-danger"
              @click="deleteAppointment()"
            >
              Delete
            </button>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import axios from "axios";

export default {
  name: "Haircut",
  data() {
    return {
      appointments: [],
      idToDelete: null,
    };
  },
  methods: {
    getAppointments() {
      axios
        .get("http://localhost:8080/appointment")
        .then((response) => {
          this.appointments = response.data;
          console.log(this.appointments);
        })
        .catch((error) => {
          alert(error);
        });
    },
    deleteAppointment() {
      axios
        .delete("http://localhost:8080/appointment/" + this.idToDelete)
        .then((response) => {
          console.log(response);
          alert("Appointment" + this.idToDelete + " deleted!");
          window.location.reload();
        })
        .catch((error) => {
          alert(error);
        });
    },
  },
  created() {
    this.getAppointments();
  },
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
.module {
  width: 250px;
  margin: 0 0 1em 0;
  overflow: hidden;
}
.module p {
  margin: 0;
}

.line-clamp {
  display: -webkit-box;
  -webkit-line-clamp: 2;
  -webkit-box-orient: vertical;
}
</style>
