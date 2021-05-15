import Vue from "vue";
import VueRouter from "vue-router";
import Haircut from "../components/Haircut.vue";
import Appointment from "../components/Appointment.vue";
Vue.use(VueRouter);

const routes = [
  {
    path: "/",
    name: "Haircut",
    component: Haircut,
  },
  {
    path: "/appointment",
    name: "Appointment",
    component: Appointment,
  },
];

const router = new VueRouter({
  routes,
});

export default router;
