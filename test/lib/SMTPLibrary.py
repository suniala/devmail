import smtplib
from email.mime.text import MIMEText

def send_mail():
    """Send an email fix hard coded content"""
    msg = MIMEText("Terve!")

    # me == the sender's email address
    # you == the recipient's email address
    msg['Subject'] = 'This is a test'
    sender = 'test@integration.com'
    to = 'recipien@av8e87r29iyc8.com'
    msg['From'] = sender
    msg['To'] = to

    s = smtplib.SMTP('localhost', 2525)
    s.sendmail(sender, [to], msg.as_string())
    s.quit()
