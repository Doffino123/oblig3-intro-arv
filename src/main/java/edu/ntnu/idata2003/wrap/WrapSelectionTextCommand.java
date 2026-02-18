package edu.ntnu.idata2003.wrap;

public class WrapSelectionTextCommand extends WrapTextCommand {
  private final String selection;

  public WrapSelectionTextCommand(String opening, String end, String selection) {
    super(opening, end);
    this.selection = selection;
  }

  @Override
  public String execute(String text) {
    return text.replace(selection, super.execute(selection));
  }

  public String getSelection() {
    return selection;
  }
}
