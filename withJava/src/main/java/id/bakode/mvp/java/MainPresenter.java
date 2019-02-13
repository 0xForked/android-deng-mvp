package id.bakode.mvp.java;

/**
 * Created by A. A. Sumitro on 2/13/2019
 * aasumitro@merahputih.id
 * https://aasumitro.id
 */
class MainPresenter {

    private MainView mainView;
    private MainInteractor mainInteractor;

    MainPresenter(
            MainView mainView,
            MainInteractor mainInteractor
    ) {
        this.mainView = mainView;
        this.mainInteractor = mainInteractor;
    }

    void calculate() {}

}
