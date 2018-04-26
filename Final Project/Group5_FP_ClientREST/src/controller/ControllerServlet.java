package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ws.ClientRest;

/**
 * Servlet implementation class ControllerServlet
 */

public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ControllerServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter mPrintWriter = response.getWriter();
		response.setContentType("text/html");
		try {
			ClientRest mClientRest = new ClientRest();
//			mPrintWriter.println("before call");

			String s_ws02_cust_state = request.getParameter("ws02_cust_state");
			String s_ws01_cust_namee = request.getParameter("ws01_cust_name");
			String s_ws03_cust_name = request.getParameter("ws03_cust_name");
			String s_ws04_transaction_date = request.getParameter("ws04_transaction_date");
			String s_ws05_location_city = request.getParameter("ws05_location_city");
			String s_ws06_model_name = request.getParameter("ws06_model_name");
			String s_ws07_make_year = request.getParameter("ws07_make_year");
			String s_ws08_emp_fname = request.getParameter("ws08_emp_fnamer");
			String s_ws10_payment_date = request.getParameter("ws10_payment_date");
			String s_ws11_cust_id = request.getParameter("ws11_cust_id");
			String s_ws12_emp_name = request.getParameter("ws12_emp_name");
			String s_ws13_cust_name = request.getParameter("ws13_cust_name");
			String s_ws14_emp_name = request.getParameter("ws14_emp_name");
			String s_ws17_get_zip = request.getParameter("ws17_get_zip");
			String s_ws18_get_emp_name = request.getParameter("ws18_get_emp_name");
			String s_ws19_comment_id = request.getParameter("ws19_comment-id");

			if (s_ws01_cust_namee != null && !s_ws01_cust_namee.isEmpty()) {
				mPrintWriter.println("<br>" + mClientRest.getCustomerInfo(s_ws01_cust_namee) + "<br>");
			}

			if (s_ws02_cust_state != null && !s_ws02_cust_state.isEmpty()) {
				mPrintWriter.println("<br>" + mClientRest.getCustomerInfoOnState(s_ws02_cust_state) + "<br>");
			}

			if (s_ws03_cust_name != null && !s_ws03_cust_name.isEmpty()) {
				mPrintWriter.println("<br>" + mClientRest.getCustomerAddressInfo(s_ws03_cust_name) + "<br>");
			}

			if (s_ws04_transaction_date != null && !s_ws04_transaction_date.isEmpty()) {
				mPrintWriter.println("<br>" + mClientRest.getTransactionsDetailsInfo(s_ws04_transaction_date) + "<br>");
			}

			if (s_ws05_location_city != null && !s_ws05_location_city.isEmpty()) {
				mPrintWriter.println("In if, --------");
				mPrintWriter.println("<br>" + mClientRest.getLocationInfo(s_ws05_location_city) + "<br>");
			}
			// s_ws06_model_name
			if (s_ws06_model_name != null && !s_ws06_model_name.isEmpty()) {
				mPrintWriter.println("<br>" + mClientRest.getModelWiseVehicles(s_ws06_model_name) + "<br>");
			}

			if (s_ws07_make_year != null && !s_ws07_make_year.isEmpty()) {
				mPrintWriter.println("<br>" + mClientRest.getMakeYearWiseVehicles(s_ws07_make_year) + "<br>");
			}
			// s_ws08_emp_fname

			if (s_ws08_emp_fname != null && !s_ws08_emp_fname.isEmpty()) {
				mPrintWriter.println("<br>" + mClientRest.getFirstNameWiseEmployees(s_ws08_emp_fname) + "<br>");
			}

			if (request.getParameter("ws09_get_pricings_info") != null) {
				mPrintWriter.println("<br>" + mClientRest.getPricingsInfo() + "<br>");
			}

			if (s_ws10_payment_date != null && !s_ws10_payment_date.isEmpty()) {
				mPrintWriter.println("<br>" + mClientRest.getPaymentsInfo(s_ws10_payment_date) + "<br>");
			}

			if (s_ws11_cust_id != null && !s_ws11_cust_id.isEmpty()) {
				mPrintWriter.println("<br>" + mClientRest.getCustomerOrdersCount(s_ws11_cust_id) + "<br>");
			}

			if (s_ws12_emp_name != null && !s_ws12_emp_name.isEmpty()) {
				mPrintWriter.println("<br>" + mClientRest.getEmployeeExpenses(s_ws12_emp_name) + "<br>");
			}

			if (s_ws13_cust_name != null && !s_ws13_cust_name.isEmpty()) {
				mPrintWriter.println("<br>" + mClientRest.getCustomerwiseInvoice(s_ws13_cust_name) + "<br>");
			}

			if (s_ws14_emp_name != null && !s_ws14_emp_name.isEmpty()) {
				mPrintWriter.println("<br>" + mClientRest.getEmployeeWiseInfo(s_ws14_emp_name) + "<br>");
			}

			if (request.getParameter("ws15_get_Invoice_Amounts") != null) {
				mPrintWriter.println("<br>" + mClientRest.getOrderInvoiceAmount() + "<br>");
			}

			if (request.getParameter("ws16_get_title_wise_counts") != null) {
				mPrintWriter.println("<br>" + mClientRest.getTitleWiseCount() + "<br>");
			}

			if (s_ws17_get_zip != null && !s_ws17_get_zip.isEmpty()) {
				mPrintWriter.println("<br>" + mClientRest.getZipCodeWiseCustInfo(s_ws17_get_zip) + "<br>");
			}

			if (s_ws18_get_emp_name != null && !s_ws18_get_emp_name.isEmpty()) {
				mPrintWriter.println("<br>" + mClientRest.getEmployeeTransactionInfo(s_ws18_get_emp_name) + "<br>");
			}

			if (s_ws19_comment_id != null && !s_ws19_comment_id.isEmpty()) {
				mPrintWriter.println("<br>" + mClientRest.getCommentsDetails(s_ws19_comment_id) + "<br>");
			}

			if (request.getParameter("ws20_get_allComments") != null) {
				mPrintWriter.println("<br>" + mClientRest.getAllComments() + "<br>");
			}
		} catch (Exception e) {
			mPrintWriter.println(e.getMessage());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
