package DP15_Bridge;

public class TVControl extends TVControlabs {
    private boolean isOn = false;
    public TVControl(Control control){
        super(control);
    }

    @Override
    public void OnOff(){
        if(isOn){
            isOn = false;
            tControl.Off();
        }else{
            isOn = true;
            tControl.On();
        }
    }
}
