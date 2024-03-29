import React from "react";

const Spinner = () => {
  return (
    <div
      className="d-flex align-items-center justify-content-center"
      style={{ minHeight: "80vh" }}
    >
      <div className="d-flex justify-content-center">
        <div className="spinner-border" role="status">
          <span className="visually-hidden">Loading...</span>
        </div>
      </div>
    </div>
  );
};

export default Spinner;
