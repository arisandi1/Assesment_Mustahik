package petik.or.arisandi.id.assessmentmustahik.Util;

import android.app.Application;
import android.text.TextUtils;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

/**
 * Created by PeTIK on 02/07/2018.
 */

public class AppController extends Application {

    private static final String TAG = AppController.class.getSimpleName();
    private static AppController instance;
    RequestQueue mRequestQueue;

    public void onCrete(){
        super.onCreate();
        instance = this;
    }

    public static AppController getInstance() {
        return instance;
    }

    private RequestQueue getRequestQueue(){
        if (mRequestQueue == null){
           mRequestQueue = Volley.newRequestQueue(getApplicationContext());
        }
        return mRequestQueue;
    }
    public <T> void addToRequestQueue(Request<T> req, String tag) {
        req.setTag(TextUtils.isEmpty(tag) ? TAG : tag);
        getRequestQueue().add(req);
    }
    public  <T> void addToRequestQueue (Request<T> req){
        if (mRequestQueue != null){
            mRequestQueue.cancelAll(req);
        }
    }
}
