package com.example.graphics1;

import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;

public class MainActivity extends Activity {
	
	GLView view;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		view = new GLView(this);
		setContentView(view);
	}

	protected void onPause() {
		super.onPause();
		view.onPause();
	}
	
	protected void onResume() {
		super.onResume();
		view.onResume();
	}
	
	class GLView extends GLSurfaceView {
		GLView(Context context) {
			super(context);
			setRenderer(new GLRenderer(context));
		}
	}
}


