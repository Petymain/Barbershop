<template>
  <div class="container">
    <div style="margin-top: 50px;">
      <!-- Button trigger modal -->
      <button
        type="button"
        class="btn btn-primary"
        data-bs-toggle="modal"
        data-bs-target="#addHaircutModal"
      >
        Add Haircut
      </button>

      <!-- Modal -->
      <div
        class="modal fade"
        id="addHaircutModal"
        tabindex="-1"
        aria-labelledby="ModalLabel"
        aria-hidden="true"
      >
        <div class="modal-dialog">
          <div class="modal-content">
            <div class="modal-header">
              <h5 class="modal-title" id="ModalLabel">New Haircut</h5>
              <button
                type="button"
                class="btn-close"
                data-bs-dismiss="modal"
                aria-label="Close"
              ></button>
            </div>
            <div class="modal-body">
              <form>
                <div class="mb-2">
                  <label for="name" class="form-label">Haircut name</label>
                  <input
                    type="email"
                    class="form-control"
                    id="name"
                    v-model="haircut.name"
                    aria-describedby="emailHelp"
                  />
                </div>
                <div class="mb-2">
                  <label for="price" class="form-label">Price</label>
                  <input
                    type="number"
                    class="form-control"
                    id="price"
                    v-model="haircut.price"
                  />
                </div>
                <div class="mb-2">
                  <label for="picture" class="form-label">Picture URL</label>
                  <input
                    type="text"
                    class="form-control"
                    v-model="haircut.pictureURL"
                    id="picture"
                  />
                </div>
                <div class="mb-2">
                  <label for="note" class="form-label">Note</label>
                  <textarea
                    name="note"
                    id="note"
                    class="form-control"
                    v-model="haircut.note"
                    maxlength="100"
                  ></textarea>
                </div>
              </form>
            </div>
            <div class="modal-footer">
              <button
                type="button"
                class="btn btn-secondary"
                data-bs-dismiss="modal"
              >
                Close
              </button>
              <button type="button" class="btn btn-primary" @click="addHaircut">
                Save
              </button>
            </div>
          </div>
        </div>
      </div>
    </div>

    <section style="margin: 25px 0px;">
      <div class="row g-3">
        <div class="col-md-3" v-for="h in haircuts" :key="h.id">
          <div class="card" style="height: 550px;">
            <img
              :src="
                h.pictureURL ||
                  'https://commons.wikimedia.org/wiki/File:No_Image_Available.jpg'
              "
              style="max-height: 340px;"
              class="card-img-top"
              :alt="h.name"
            />
            <div class="card-body">
              <h5 class="card-title">{{ h.name }} (${{ h.price }})</h5>
              <p class="card-text module ine-clamp">
                {{ h.note }}
              </p>
             
            </div>
          </div>
        </div>
      </div>
    </section>
  </div>
</template>

<script>
import axios from "axios";

export default {
  name: "Haircut",
  data() {
    return {
      haircut: {},
      haircuts: [],
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
    addHaircut() {
      axios
        .post("http://localhost:8080/haircut", this.haircut)
        .then((response) => {
          console.log(response);
          window.location.reload();
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
