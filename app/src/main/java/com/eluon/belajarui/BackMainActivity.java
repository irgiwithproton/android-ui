//package com.eluon.belajarui;
//
//import android.app.Dialog;
//import android.content.Context;
//import android.content.Intent;
//import android.graphics.Bitmap;
//import android.graphics.BitmapFactory;
//import android.graphics.Color;
//import android.graphics.drawable.ColorDrawable;
//import android.os.Bundle;
//import android.view.Gravity;
//import android.view.LayoutInflater;
//import android.view.MenuItem;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ImageView;
//import android.widget.PopupWindow;
//import android.widget.Toast;
//
//import androidx.annotation.NonNull;
//import androidx.annotation.Nullable;
//import androidx.appcompat.app.ActionBar;
//import androidx.appcompat.app.ActionBarDrawerToggle;
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.appcompat.widget.Toolbar;
//import androidx.coordinatorlayout.widget.CoordinatorLayout;
//import androidx.drawerlayout.widget.DrawerLayout;
//import androidx.fragment.app.Fragment;
//import androidx.palette.graphics.Palette;
//
//import com.bumptech.glide.Glide;
//import com.bumptech.glide.request.RequestOptions;
//import com.eluon.belajarui.activity.DashboardDrawerActivity;
//import com.eluon.belajarui.activity.ProfileDrawerActivity;
//import com.eluon.belajarui.activity.SearchDrawerActivity;
//import com.eluon.belajarui.fragment.DashboardFragment;
//import com.eluon.belajarui.fragment.ProfileFragment;
//import com.eluon.belajarui.fragment.SearchFragment;
//import com.google.android.material.appbar.CollapsingToolbarLayout;
//import com.google.android.material.bottomnavigation.BottomNavigationView;
//import com.google.android.material.navigation.NavigationView;
//
//public class BackMainActivity extends AppCompatActivity {
//
//    BottomNavigationView bottomNavigationView;
//    DrawerLayout drawerLayout;
//    ActionBarDrawerToggle toggle;
//    NavigationView navigationView;
//    private Context mContext;
//    private PopupWindow mPopupWindow;
//    CoordinatorLayout detailMain;
//    Toolbar toolbar;
//    CollapsingToolbarLayout collapsingToolbarLayout;
//    Dialog dialog;
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        mContext = this.getApplicationContext();
//        detailMain = findViewById(R.id.detail_main);
//
//        //dialog
//        dialog = new Dialog(this);
//        dialog.setContentView(R.layout.rules_view);
//        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
//        dialog.show();
//
//        // reff https://medium.com/quick-code/android-navigation-drawer-e80f7fc2594f
//
//        toolbar = findViewById(R.id.toolbar_ku);
//        setSupportActionBar(toolbar);
//
//        final ActionBar actionBar = getSupportActionBar();
//        actionBar.setDisplayHomeAsUpEnabled(true);
//
//        collapsingToolbarLayout = findViewById(R.id.collap_layout);
//        collapsingToolbarLayout.setTitle("Ini Nama");
//
//        final ImageView imageView = findViewById(R.id.backdrop);
//        Glide.with(this).load(R.drawable.gambar).apply(RequestOptions.centerCropTransform()).into(imageView);
//
//        // for popup view
//        // reff https://www.okedroid.com/2016/04/cara-menerapkan-contoh-popup-window-android.html
//        imageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                LayoutInflater inflater1 = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//                View customView = inflater1.inflate(R.layout.pop_up_window, null);
//
//                mPopupWindow = new PopupWindow(customView, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
//
//                ImageView backPopUp = customView.findViewById(R.id.close_popup);
//                backPopUp.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//                        mPopupWindow.dismiss();
//                        mPopupWindow = null;
//                    }
//                });
//
//                Toast.makeText(mContext, "Popup", Toast.LENGTH_SHORT).show();
//                mPopupWindow.showAtLocation(detailMain, Gravity.CENTER,0, 0);
//            }
//        });
//
//        drawerLayout = findViewById(R.id.nav_drawer);
//        toggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close);
//
//        drawerLayout.addDrawerListener(toggle);
//        toggle.syncState();
//
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//
//        navigationView = findViewById(R.id.nav_slide);
//
//        //overlay reff http://old.flavienlaurent.com/blog/2013/08/14/viewoverlay-when-how-and-for-what-purpose/
////        Drawable igm = getApplicationContext().getResources().getDrawable(R.drawable.ic_arrow_back_black_24dp);
////        Drawable igm = getApplicationContext().getResources().getDrawable(R.drawable.gambar);
////        ViewOverlay overlay = navigationView.getOverlay();
////        igm.setBounds(10, 10, 250, 250);
////        overlay.add(igm);
//
//        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
//                int id = menuItem.getItemId();
//                switch (id){
//                    case R.id.slide_dasboard:
//                        Intent intent = new Intent(BackMainActivity.this, DashboardDrawerActivity.class);
//                        startActivity(intent);
//                        Toast.makeText(BackMainActivity.this, "pertama", Toast.LENGTH_SHORT).show();
//                        break;
//                    case R.id.slide_search:
//                        Intent intent2 = new Intent(BackMainActivity.this, SearchDrawerActivity.class);
//                        startActivity(intent2);
//                        Toast.makeText(BackMainActivity.this, "kedua", Toast.LENGTH_SHORT).show();
//                        break;
//                    case R.id.slide_profile:
//                        Intent intent3 = new Intent(BackMainActivity.this, ProfileDrawerActivity.class);
//                        startActivity(intent3);
//                        Toast.makeText(BackMainActivity.this, "ketiga", Toast.LENGTH_SHORT).show();
//                        break;
//                    default:
//                        return true;
//                }
//                return true;
//            }
//        });
//        // reff https://medium.com/quick-code/android-navigation-drawer-e80f7fc2594f
//
//        // reff navigation bottom navbar https://www.youtube.com/watch?v=x0E-SqJ0mNA
//        bottomNavigationView = findViewById(R.id.nav_bottom);
//        if (savedInstanceState == null){
//            getSupportFragmentManager().beginTransaction().replace(R.id.for_contrainer, new DashboardFragment()).commit();
//        }
//        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
//            @Override
//            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
//                Fragment fragment = null;
//
//                switch (menuItem.getItemId()){
//                    case R.id.dasboard:
//                        fragment = new DashboardFragment();
//                        break;
//                    case R.id.search:
//                        fragment = new SearchFragment();
//                        break;
//                    case R.id.profile:
//                        fragment = new ProfileFragment();
//                        break;
//                }
//                getSupportFragmentManager().beginTransaction().replace(R.id.for_contrainer, fragment).commit();
//                return true;
//            }
//        });
//        // reff navigation bottom navbar https://www.youtube.com/watch?v=x0E-SqJ0mNA
//
//        //reff palatte https://www.youtube.com/watch?v=WLy4lzLt0ts
//        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.gambar);
//        Palette.from(bitmap).generate(new Palette.PaletteAsyncListener() {
//            @Override
//            public void onGenerated(@Nullable Palette palette) {
//                if (palette != null){
//                    collapsingToolbarLayout.setContentScrimColor(palette.getMutedColor(R.attr.colorPrimary));
//                }
//            }
//        });
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        if (toggle.onOptionsItemSelected(item)){
//            return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }
//
//    @Override
//    public void onBackPressed() {
//        if (mPopupWindow != null){
//            mPopupWindow.dismiss();
//            mPopupWindow = null;
//        }else {
//            super.onBackPressed();
//        }
//    }
//}
