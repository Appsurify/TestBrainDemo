import subprocess,shlex,sys
def runcommand(command, stream="false"):
    print("platform = " + sys.platform)
    if stream == "true":
        process = subprocess.Popen(command, stdout=subprocess.PIPE, stderr=subprocess.PIPE, shell=True, encoding='utf-8')
        output = ""
        while(True):
            # returns None while subprocess is running
            retcode = process.poll() 
            line = process.stdout.readline()
            output = output + line
            print(line, end = '')
            #yield line
            if retcode is not None:
                break
        return output
    if stream == "false":    
        result = subprocess.run(command,  shell=True, capture_output=True)
        #subprocess.run(['ls', '-l'])stdout=subprocess.PIPE,
        print((result.stdout.decode('utf-8')))
        print((result.stderr.decode('utf-8')))
        return result.stdout.decode('utf-8')

pipeoutput = "true"
commit=runcommand("git log -1 --pretty=\"%H\"")
commit = commit.rstrip().rstrip("\n\r")
print(("commit id = " + commit))

#git branch | grep \* | cut -d ' ' -f2
#git rev-parse --abbrev-ref HEAD
#https://stackoverflow.com/questions/6245570/how-to-get-the-current-branch-name-in-git


branch=runcommand("git rev-parse --abbrev-ref HEAD").rstrip("\n\r").rstrip()
print(("branch = " + branch))