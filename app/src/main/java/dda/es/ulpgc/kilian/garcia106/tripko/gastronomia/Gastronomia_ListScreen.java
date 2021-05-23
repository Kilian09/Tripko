package dda.es.ulpgc.kilian.garcia106.tripko.gastronomia;

import androidx.fragment.app.FragmentActivity;

import java.lang.ref.WeakReference;

import dda.es.ulpgc.kilian.garcia106.tripko.R;
import dda.es.ulpgc.kilian.garcia106.tripko.app.AppMediator;

public class Gastronomia_ListScreen {

    public static void configure(Gastronomia_ListContract.View view) {

        WeakReference<FragmentActivity> context =
                new WeakReference<>((FragmentActivity) view);

        String data = context.get().getString(R.string.app_name);

        AppMediator mediator = AppMediator.getInstance();

        Gastronomia_ListContract.Presenter presenter = new Gastronomia_ListPresenter(mediator);
        Gastronomia_ListContract.Model model = new Gastronomia_ListModel(data);
        presenter.injectModel(model);
        presenter.injectView(new WeakReference<>(view));

        view.injectPresenter(presenter);

    }
}