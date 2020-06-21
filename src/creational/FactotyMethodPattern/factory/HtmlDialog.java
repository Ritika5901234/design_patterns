package creational.FactotyMethodPattern.factory;

import creational.FactotyMethodPattern.Buttons.Button;
import creational.FactotyMethodPattern.Buttons.HtmlButton;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
