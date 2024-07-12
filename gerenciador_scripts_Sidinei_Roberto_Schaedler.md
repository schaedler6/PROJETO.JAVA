
# Script and Automation Manager

Welcome to the Script and Automation Manager project! This is a comprehensive web-based tool developed in Python using the Flask framework. It enables you to register, manage, and execute scripts in various languages such as Python, Shell Script, and PHP. You can run these scripts manually or schedule them to run at regular intervals using the croniter library.

## Features

Here's what you can do with the Script and Automation Manager:

- **Register Scripts**: Add scripts with details like name, folder, GitHub repository URL, language, command line, parameters, and log file.
- **Clone Repositories**: Automatically clone the script's GitHub repository into the manager's script folder.
- **Execute Scripts**: Run scripts manually or automatically, with the option to view logs in real-time.
- **Schedule Scripts**: Schedule scripts to run at regular intervals using the croniter library.
- **User Access Control**: Secure the system with login and password, and add new users.
- **User-Friendly Interface**: Enjoy a responsive web interface developed with Bootstrap.

## Installation

Follow these steps to get the Script and Automation Manager up and running on your machine:

1. **Clone the Repository**:
    ```sh
    git clone https://github.com/tmdstudio/gerenciador-scripts.git
    ```

2. **Install Dependencies**:
    Navigate to the project folder and install the required dependencies:
    ```sh
    pip install -r requirements.txt
    ```

3. **Set Up Configuration**:
    Create a `.env` file in the project folder and configure the environment variables:
    ```env
    SQLALCHEMY_DATABASE_URI=sqlite:///gerenciador.db
    SECRET_KEY=your-secret-key
    SERVER_NAME=localhost:5500
    ```

4. **Start the Server**:
    Run the server with the following command:
    ```sh
    gunicorn -w 4 -b 0.0.0.0:5500 main:app
    ```

5. **Access the System**:
    Open your web browser and go to:
    [http://localhost:5500](http://localhost:5500)

## Usage

Here's how to use the Script and Automation Manager:

- **Register Scripts**: Go to the registration page and fill out the form with the script details.
- **Manage Scripts**: The scripts page lists all registered scripts, with options to view, edit, activate, deactivate, delete, and update.
- **Execute Scripts**: Click the "Execute" button to run a script manually.
- **Schedule Scripts**: Go to the crontab page to schedule script execution at regular intervals.
- **Access Control**: Log in to the system through the login page.

## Contribution

We welcome contributions to the project! The code is available on GitHub: [[URL removed]]([URL removed]).

To contribute:

1. **Fork the Repository**: Create a fork and make your changes in a new branch.
2. **Submit a Pull Request**: Implement your changes and submit a pull request to the main repository.
3. **Report Issues**: Open issues to report bugs or suggest new features.

## Authors

- **Gabriel Barros** ([https://github.com/gdbarros94](https://github.com/gdbarros94))
- **Leo Souza** ([https://github.com/leosouza94](https://github.com/leosouza94))
- **TMDStudio** ([https://tmdstudio.com.br](https://tmdstudio.com.br))

## Notes

This project is under continuous development, and new features will be added in the future. If you encounter any issues or have any questions, please open an issue on GitHub. Thank you for your collaboration!
