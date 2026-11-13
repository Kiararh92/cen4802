resource "kubernetes_service_v1" "herbal_app_service" {

  metadata {
    name = "herbal-app-service"
  }

  spec {
    selector = {
      app = "herbal-app"
    }

    port {

      port        = 8080
      target_port = 8080
    }
    type = "NodePort"
  }
}