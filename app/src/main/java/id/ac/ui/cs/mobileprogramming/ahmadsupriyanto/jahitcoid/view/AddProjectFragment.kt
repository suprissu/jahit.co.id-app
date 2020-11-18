package id.ac.ui.cs.mobileprogramming.ahmadsupriyanto.jahitcoid.view

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import id.ac.ui.cs.mobileprogramming.ahmadsupriyanto.jahitcoid.R
import id.ac.ui.cs.mobileprogramming.ahmadsupriyanto.jahitcoid.viewmodel.ProjectListViewModel
import kotlinx.android.synthetic.main.add_project_fragment.*

class AddProjectFragment : Fragment() {

    companion object {
        fun newInstance() =
            AddProjectFragment()
    }

    private lateinit var viewModel: ProjectListViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.add_project_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ProjectListViewModel::class.java)
    }

    override fun onStart() {
        super.onStart()
        back_button.setOnClickListener {
            activity?.supportFragmentManager?.popBackStack();
        }
    }

}