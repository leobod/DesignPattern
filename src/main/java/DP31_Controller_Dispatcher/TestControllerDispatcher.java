package DP31_Controller_Dispatcher;

public class TestControllerDispatcher {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.dispatchRequest("HOME");
        controller.dispatchRequest("STUDENT");
    }
}
