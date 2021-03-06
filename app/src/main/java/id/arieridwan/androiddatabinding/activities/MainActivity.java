package id.arieridwan.androiddatabinding.activities;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import id.arieridwan.androiddatabinding.R;
import id.arieridwan.androiddatabinding.databinding.ActivityMainBinding;
import id.arieridwan.androiddatabinding.viewmodels.MainActivityVM;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        MainActivityVM viewModel = new MainActivityVM(this);
        // set vm akan otomatis ada ketika kita menamai vaiable di xml
        binding.setVm(viewModel);
    }

}
