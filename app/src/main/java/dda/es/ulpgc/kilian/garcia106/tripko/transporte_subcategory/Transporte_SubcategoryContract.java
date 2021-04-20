package dda.es.ulpgc.kilian.garcia106.tripko.transporte_subcategory;

import java.lang.ref.WeakReference;

public interface Transporte_SubcategoryContract {

    interface View {
        void injectPresenter(Presenter presenter);

        void onDataUpdated(Transporte_SubcategoryViewModel viewModel);

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
    }

    interface Model {
        String getStoredData();

        void onDataFromNextScreen(String data);

        void onRestartScreen(String data);

        void onDataFromPreviousScreen(String data);
    }

}