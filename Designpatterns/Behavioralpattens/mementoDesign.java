//imagine your using a text editor where you often make changes,but sometimes you need to hit undo 
//to go back to previous version
//for this we can use this design pattern which capture and store an object state,so the object state can
//be restored later without violating encapusulation
package Designpatterns.Behavioralpattens;
import java.util.Stack;
class textEditor{
    public String text;
    void setText(String text){
        this.text=text;
    }
    memento saveText(){
        return new memento(text);
    }
    void getText(){
        System.out.println(this.text);
    }
    void Restore(memento restore){
        this.text=restore.getText();
    }
}
class memento{
    public String text;
    memento(String text){
        this.text=text;
    }
    String getText(){
        return this.text;
    }
}
class historyHandiler{
      Stack<memento> undoHistory;
      Stack<memento> redoHistory;
      historyHandiler(){
        this.undoHistory=new Stack<>();
        this.redoHistory=new Stack<>();
      }
      void saveText(memento sav){
        undoHistory.push(sav);
        redoHistory.clear();
      }
      memento undoOperation(memento current){
              if(undoHistory!=null){
                redoHistory.push(current);
                return undoHistory.pop();
              }
              return null;
      }
      memento redoOperation(memento current){
        if(redoHistory!=null){
            undoHistory.push(current);
            return redoHistory.pop();
          }
          return null;
      }
}
public class mementoDesign {
    public void main(){
        historyHandiler historyList=new historyHandiler();
        textEditor vs=new textEditor();
        vs.setText("hello!");
        vs.getText();
        historyList.saveText(vs.saveText());
        vs.setText("hello World!");
        vs.getText();
        historyList.saveText(vs.saveText());
        vs.setText("hello World! morning");
        vs.Restore(historyList.undoOperation(vs.saveText()));
        vs.getText();
        vs.Restore(historyList.redoOperation(vs.saveText()));
        vs.getText();
    }
}
