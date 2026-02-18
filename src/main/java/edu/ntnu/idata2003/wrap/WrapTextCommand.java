package edu.ntnu.idata2003.wrap;
import edu.ntnu.idata2003.TextCommand;

public class WrapTextCommand implements TextCommand {
  protected final String opening;
  protected final String end;

  public WrapTextCommand(String opening, String end) {
    this.opening = opening;
    this.end = end;
  }

  @Override
  public String execute(String text) {
    if (!text.isBlank()) {
      text = opening + text + end;
    }
    return text;
  }

  public String getOpening() {
    return opening;
  }

  public String getEnd() {
    return end;
  }
}
