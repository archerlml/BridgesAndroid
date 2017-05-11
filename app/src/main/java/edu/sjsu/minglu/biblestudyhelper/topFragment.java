package edu.sjsu.minglu.biblestudyhelper;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link topFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link topFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class topFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private static int[] imgs = { R.drawable.c1, R.drawable.c2, R.drawable.c3, R.drawable.c4,R.drawable.c5,R.drawable.c6,R.drawable.c7,R.drawable.c8 };
    private int chapter = 0;
    private int count = 0;
    //private static int[][] passengers = { {R.drawable.c1_1, R.drawable.c1_2, R.drawable.c1_3, R.drawable.c1_4,R.drawable.c1_5}, {R.drawable.c2_1, R.drawable.c2_2, R.drawable.c2_3, R.drawable.c2_4,R.drawable.c2_5}, {R.drawable.c3_1, R.drawable.c3_2, R.drawable.c3_3, R.drawable.c3_4,R.drawable.c3_5}, {R.drawable.c4_1, R.drawable.c4_2, R.drawable.c4_3, R.drawable.c4_4,R.drawable.c4_5}, {R.drawable.c5_1, R.drawable.c5_2, R.drawable.c5_3, R.drawable.c5_4,R.drawable.c5_5}, {R.drawable.c6_1, R.drawable.c6_2, R.drawable.c6_3, R.drawable.c6_4,R.drawable.c6_5}, {R.drawable.c7_1, R.drawable.c7_2, R.drawable.c7_3, R.drawable.c7_4,R.drawable.c7_5}, {R.drawable.c8_1, R.drawable.c8_2, R.drawable.c8_3, R.drawable.c8_4,R.drawable.c8_5}};

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private ImageView image_view;

    private OnFragmentInteractionListener mListener;

    public topFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment topFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static topFragment newInstance(String param1, String param2) {
        topFragment fragment = new topFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       // return inflater.inflate(R.layout.fragment_top, container, false);
        final View view=  inflater.inflate(R.layout.fragment_top, container, false);
        final ImageView imgFavorite = (ImageView) view.findViewById(R.id.chapter);
        final ImageView bibleimg = (ImageView) view.findViewById(R.id.bible);
        imgFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (chapter == 7)
                    chapter = 0;
                else
                    chapter++;
                imgFavorite.setImageResource(imgs[chapter]);
                count = 0;
                String id = "c" + chapter + "_0";
                int resID = getResources().getIdentifier(id, "drawable", "edu.sjsu.minglu.biblestudyhelper");
                ImageView temp = (ImageView) view.findViewById(R.id.bible);
                temp.setImageResource(resID);

            }
        });
        //image_view = (ImageView) view.findViewById(R.id.chapter);
        //image_view.setImageResource(R.drawable.c2);
        //image_view.bringToFront();
        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

//    @Override
//    public void onAttach(Context context) {
//        super.onAttach(context);
//        if (context instanceof OnFragmentInteractionListener) {
//            mListener = (OnFragmentInteractionListener) context;
//        } else {
//            throw new RuntimeException(context.toString()
//                    + " must implement OnFragmentInteractionListener");
//        }
//    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
        public void ontopFragmentInteraction(String string);
    }
}
