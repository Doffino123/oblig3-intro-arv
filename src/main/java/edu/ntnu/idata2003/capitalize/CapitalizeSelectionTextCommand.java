package edu.ntnu.idata2003.capitalize;

  public class CapitalizeSelectionTextCommand extends CapitalizeTextCommand {
    private final String selection;

    public CapitalizeSelectionTextCommand(String selection) {
      this.selection = selection;
    }

    @Override
    public String execute(String text) {
      String capitalizedSelection = new CapitalizeTextCommand().execute(selection);
      return text.replace(selection, capitalizedSelection);
    }

    public String getSelection() {
      return selection;
    }

}
