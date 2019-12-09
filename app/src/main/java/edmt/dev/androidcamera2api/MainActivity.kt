package edmt.dev.androidcamera2api;

import ...

public class MainActivity  extends AppCompatActivity() {

    private Button btnCapture;
    private TextureView textureView;

    @override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textureView = (TextureView)findViewById(R.id.textureView);
        assert textureView !=null
        }
    }
}