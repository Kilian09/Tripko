package dda.es.ulpgc.kilian.garcia106.tripko.conversor_moneda;

import java.lang.ref.WeakReference;

public interface Conversor_MonedaContract {

    interface View {
        void injectPresenter(Presenter presenter);

        void onDataUpdated(Conversor_MonedaViewModel viewModel);

        void navigateToNextScreen();
    }

    interface Presenter {
        void injectView(WeakReference<View> view);

        void injectModel(Model model);

        void onResume();

        void onStart();

        void onRestart();

        void onBackPressed();

        void onPause();

        void onDestroy();

        void onCalcularClicked(double cantidad, String divisa, String pasarA);
    }

    interface Model {

        void convertirDivisa(double cantidad, String divisa, String pasarA);

        double getResultado();
    }

}