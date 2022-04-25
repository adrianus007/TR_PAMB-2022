// Generated by view binder compiler. Do not edit!
package com.example.tr_pamb.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.tr_pamb.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAdminAddNewProductBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button addNewProduct;

  @NonNull
  public final EditText productDescription;

  @NonNull
  public final EditText productName;

  @NonNull
  public final EditText productPrice;

  @NonNull
  public final ImageView selectProductImage;

  private ActivityAdminAddNewProductBinding(@NonNull RelativeLayout rootView,
      @NonNull Button addNewProduct, @NonNull EditText productDescription,
      @NonNull EditText productName, @NonNull EditText productPrice,
      @NonNull ImageView selectProductImage) {
    this.rootView = rootView;
    this.addNewProduct = addNewProduct;
    this.productDescription = productDescription;
    this.productName = productName;
    this.productPrice = productPrice;
    this.selectProductImage = selectProductImage;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAdminAddNewProductBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAdminAddNewProductBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_admin_add_new_product, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAdminAddNewProductBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.add_new_product;
      Button addNewProduct = ViewBindings.findChildViewById(rootView, id);
      if (addNewProduct == null) {
        break missingId;
      }

      id = R.id.product_description;
      EditText productDescription = ViewBindings.findChildViewById(rootView, id);
      if (productDescription == null) {
        break missingId;
      }

      id = R.id.product_name;
      EditText productName = ViewBindings.findChildViewById(rootView, id);
      if (productName == null) {
        break missingId;
      }

      id = R.id.product_price;
      EditText productPrice = ViewBindings.findChildViewById(rootView, id);
      if (productPrice == null) {
        break missingId;
      }

      id = R.id.select_product_image;
      ImageView selectProductImage = ViewBindings.findChildViewById(rootView, id);
      if (selectProductImage == null) {
        break missingId;
      }

      return new ActivityAdminAddNewProductBinding((RelativeLayout) rootView, addNewProduct,
          productDescription, productName, productPrice, selectProductImage);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
