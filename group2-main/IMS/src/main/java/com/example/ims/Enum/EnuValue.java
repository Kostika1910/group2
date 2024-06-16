package com.example.ims.Enum;

public class EnuValue {
    //    Current Position Validation
    public enum CurrentPosition {
        Backend, BA, Tester, HR, PM, NotAvailable
    }

    public enum CandidateStatus {
        Open, WaitingForInterview, Canceled, Passed, Failed, WaitingForApproval,
        Approved, Rejected, WaitingForResponse, AcceptedOffer, DeclinedOffer, CancelledOffer, Banned
    }

    public enum CandidateGender {
        Male, Female
    }
}

